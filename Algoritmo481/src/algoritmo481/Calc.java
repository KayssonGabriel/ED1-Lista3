package algoritmo481;

public class Calc {

	int converte(int num, int base) {
		int b = 0;
		int nb = 0;
		int r;

		while (num >= base) {
			r = num % base;
			nb += Math.pow(10, b) * r;
			num /= base;
			b++;
		}
		nb += Math.pow(10, b) * num;
		return nb;

	}

}
