import java.util.Scanner;

class Process
{
    int id;
    int at;
    int bt;
    int st;
    int et;
    int wt;
    int tt;
}

public class FCFS_Schedule
{
    public static void main(String[] args)
    {
        int n = 4;
        Process[] processes = new Process[n];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter arrival time and burst time: ");
        for(int i = 0; i < n; i++)
        {
            processes[i] = new Process();
            processes[i].id = i+1;
            System.out.println("Process " + processes[i].id + ":");

            System.out.print("Arrival Time: ");
            processes[i].at = sc.nextInt();

            System.out.print("Burst Time: ");
            processes[i].bt = sc.nextInt();

        }

        computeFCFS(processes, n);
        
        sc.close();
    }

    static void computeFCFS(Process[] processes, int arrsize)
    {
        int TotalWaitingTime = 0;
        int TotalTurnAroundTime = 0;

        processes[0].wt = 0;
        processes[0].st = 0;
        processes[0].tt = processes[0].bt;
        processes[0].et = processes[0].bt;

        TotalWaitingTime = TotalWaitingTime + processes[0].wt;
        
        for(int i = 1; i < arrsize; i++)
        {
            processes[i].st = processes[i-1].bt + processes[i-1].st;
            processes[i].wt = processes[i].st - processes[i].at;
            processes[i].et = processes[i].bt + processes[i-1].et;
            processes[i].tt = processes[i].et - processes[i].at;

            TotalWaitingTime = TotalWaitingTime + processes[i].wt;
            TotalTurnAroundTime = TotalTurnAroundTime + processes[i].tt;

            System.out.println("TT:" + processes[i].tt);

        }
        float averageWaitingTime = (float)TotalWaitingTime/arrsize;
        float averageTurnAroundTime = (float)TotalTurnAroundTime/arrsize;

        System.out.println("Total Waiting Time: " + TotalWaitingTime);
        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnAroundTime);

    }
}