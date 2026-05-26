using TrigoVersionTwo;

class Program
{
    static void Main(string[] args)
    {
        TrigoModel values = new TrigoModel(0, 0, 0);

        Console.WriteLine("1. Calculate Angel Using Cosine");
        Console.WriteLine("2. Calculate Angel Using Tangent");
        Console.WriteLine("3. Calculate Angel Using Secant");
        Console.WriteLine("4. Calculate Angel Using Cotangent");
        Console.WriteLine("5. Calculate Angel Using Sine");
        Console.WriteLine("   Enter Number: ");
        int x = Convert.ToInt32(Console.ReadLine());

        switch(x)
        {
            case 1:
                Console.WriteLine("Enter Opposite: ");
                values.opposite = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Hypotenuse: ");
                values.hypotenuse = Convert.ToDouble(Console.ReadLine());

                double cos = TrigoV2.CalculateCosAngle(values);

                Console.WriteLine($"Result: {cos}");
                break;

            case 2:
                Console.WriteLine("Enter Opposite: ");
                values.opposite = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Hypotenuse: ");
                values.hypotenuse = Convert.ToDouble(Console.ReadLine());

                double tan = TrigoV2.CalculateTan(values);

                Console.WriteLine($"Result: {tan}");
                break;

            case 3:
                Console.WriteLine("Enter Opposite: ");
                values.opposite = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Hypotenuse: ");
                values.hypotenuse = Convert.ToDouble(Console.ReadLine());

                double sec = TrigoV2.CalculateSec(values);

                Console.WriteLine($"Result: {sec}");
                break;

            case 4:
                Console.WriteLine("Enter Opposite: ");
                values.opposite = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Hypotenuse: ");
                values.hypotenuse = Convert.ToDouble(Console.ReadLine());

                double cot = TrigoV2.CalculateCot(values);

                Console.WriteLine($"Result: {cot}");
                break;

            case 5:
                Console.WriteLine("Enter Opposite: ");
                values.opposite = Convert.ToDouble(Console.ReadLine());
                Console.WriteLine("Enter Hypotenuse: ");
                values.hypotenuse = Convert.ToDouble(Console.ReadLine());

                double sin = TrigoV2.CalculateSinAngle(values);

                Console.WriteLine($"Result: {sin}");
                break;
        }
    }
}