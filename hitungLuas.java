public class hitungLuas 
{
	public static void main(String [] args)
	{
		inputsegitiga input = new inputsegitiga (); 
		segitiga hasil = new segitiga (); 		
		input.setAlas (6);
		input.setTinggi (7);
		hasil.hitung(input.getalas(),input.gettinggi());
		System.out.println("Hasil : "+hasil.gethitung());
	}
}