package week13.slot02.fileinputoutput;

import java.io.FileNotFoundException;

public class DataManagementTest {

	public static void main(String[] args) throws FileNotFoundException {
		DataManagement dm = new DataManagement();
		
//		dm.dataList.add(new MyData(1, "a", "b"));
//		dm.dataList.add(new MyData(2, "c", "d"));
//		dm.dataList.add(new MyData(3, "e", "f"));
//		dm.dataList.add(new MyData(4, "g", "h"));
//		
//		dm.saveToFile("mydata.xml");
		
		dm.loadFromFile("mydata.xml");
		System.out.println(dm.dataList);
		
		dm.dataList.remove(0);
		dm.saveToFile("mydata.xml");
	}
	
}
