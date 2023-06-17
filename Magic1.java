public class Magic1 {
	public static void main(String[] args) {
    // myNumber will be referred as the original number
    int myNumber = 8; // Can be any number
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;
    System.out.println(magicNumber);
	}
}