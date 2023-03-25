package JavaDSA;

public class CountOccurencesOfCharacterInString {

	public static void main(String[] args) {
	 String str= "Java Programming & Java OOPs";
     int Before=str.length();
     System.out.println("Total Number Of Characters Before Removing Character:"+Before);
     str=str.replace("a", "");
     int After=str.length();
     System.out.println("Total Number Of Characters After Removing Character:"+After);
     System.out.println("String After Removing Occurence Character:"+str);
     System.out.println("Number Of Occurence Of Character In String:"+(Before-After));
	}

}
