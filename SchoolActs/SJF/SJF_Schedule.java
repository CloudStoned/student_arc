package SJF;
import java.util.Arrays;
import java.util.Scanner;

class Process
{
    int id;
    int at = 0;
    int bt;
    int st;
    int et = 0;
    int wt;
    int tt;
}

public class SJF_Schedule
{
    public static void main(String[] args) 
    {
        int size = 4;
        Process[] processes = new Process[size];
        Scanner sc = new Scanner(System.in);

        System.out.println("Testing Hello World");
        System.out.println("Enter arrival time and burst time: ");
        System.out.println();
        for(int i = 0; i < size; i++)
        {
            processes[i] = new Process();
            processes[i].id = i + 1;

            System.out.println("Process " + processes[i].id + ": ");

            System.out.print("Enter Arrival Time: ");
            processes[i].at = sc.nextInt();

            System.out.print("Enter Burst Time: ");
            processes[i].bt = sc.nextInt();

            System.out.println();
        }

        computeSJF(processes, size);

        sc.close();
    }

    static void computeSJF(Process[] processes, int size) 
    {
        float totalWaitingTime = 0;
        float totalTurnAroundTime = 0;
        float totalThroughput = 0;



        sortByArrivalAndBurstTime(processes);
        for(int i = 1; i < size; i++)
        {
            processes[i].st = processes[i-1].bt + processes[i-1].at;
            processes[i].et = processes[i].bt + processes[i].st;
            processes[i].wt = processes[i].st - processes[i].at;
            processes[i].tt = processes[i].et - processes[i].at;


            System.out.println("Process: " + processes[i].id);
            System.out.println("Start Time: " + processes[i].st);
            System.out.println("End Time: " + processes[i].et);
            System.out.println("Waiting Time: " + processes[i].wt);
            System.out.println("Turnaround Time: " + processes[i].tt);

            System.out.println();

            totalTurnAroundTime = totalTurnAroundTime + processes[i].tt;
            totalWaitingTime    = totalWaitingTime + processes[i].wt;
            totalThroughput     = totalThroughput + processes[i].et;

        }
        float averageTurnAroundTime = totalTurnAroundTime / size;
        float averageWaitingTime    = totalWaitingTime / size; 
        float Throughput = size / totalThroughput;

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnAroundTime);
        System.out.println("Throughput : " + Throughput);

    }

    static void sortByArrivalAndBurstTime(Process[] processes) {
        Arrays.sort(processes, (process1, process2) -> 
        {
            if (process1.at == 0 && process2.at != 0) 
            {
                return -1; // Process1 comes before Process2
            } 
            
            else if (process1.at != 0 && process2.at == 0) 
            {
                return 1; // Process2 comes before Process1
            }
            return Integer.compare(process1.bt, process2.bt); // Sort by burst time
        });
    }
}