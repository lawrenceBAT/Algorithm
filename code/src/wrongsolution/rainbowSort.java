package wrongsolution;

//多指针分区，一定要以某一头出发走最快的pointer作为判断的指针

public class rainbowSort {

	public int[] rainbowSort(int[] array) {
		// Write your solution here.
		int red = 0;
		int green = 0;
		int blue = array.length - 1;
		while (green <= blue) {
			if (array[red] == -1) {
				red++;
				green++;
			} else if (array[green] == 0) {
				green++;
			} else {
				swap(array, green, blue);
				blue--;
			}
		}
		return array;
	}

	private void swap(int[] array, int a, int b) {
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}
