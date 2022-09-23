
public class Latihan03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double luas, keliling, luas_prisma, volume;
		double d1, d2, s1, s2, la, ka, tp, a;
		d1 = 14;
		d2 = 21;
		s1 = 6;
		s2 = 10;
		la = 8;
		ka = 6;
		tp = 5;
		a = 4;
		
		luas = 0.5 * d1 * d2;
		keliling = (s1 * 2) + (s2 * 2);
		
		System.out.println("MENGHITUNG LUAS DAN KELILING LAYANG-LAYANG");
		System.out.println("Luas Layang-layang = " + luas);
		System.out.println("Keliling Layang-layang = " + keliling);
		
		luas_prisma = (2 * la) + (ka * tp);
		volume = (0.5 * a * tp) * tp;
		
		System.out.println("\nMENGHITUNG LUAS DAN VOLUME PRISMA SEGITIGA");
		System.out.println("Luas Prisma Segitiga = " + luas_prisma);
		System.out.println("Volume Prisma Segitiga = " + volume);
	}

}
