package hackerRank;


public class Ejercicios {

	public Ejercicios() {
		
	}
	
	public void first10multiples(int n){
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i +" = " + n * i);
		}
	}

	public static void loops2(int a, int b, int n) {
        int result = a;
        for (int i = 0; i < n; i++) {
            result += (int) Math.pow(2, i) * b;
            System.out.print(result + " ");
        }
        System.out.println();
    }
	
}

