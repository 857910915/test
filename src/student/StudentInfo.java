package student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("serial")
public class StudentInfo implements Serializable{
	//保存文件
		public void saveInfo(ArrayList<HashMap<String, String>>list) throws IOException {
			//初始化输出流对象
			FileOutputStream out=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\StudentInfo");
			ObjectOutputStream oos=new ObjectOutputStream(out);
			//对象序列化
			oos.writeObject(list);
			//刷入
			oos.flush();
			//关闭流
			oos.close();
			out.close();
		}
	
	//读取文件
	@SuppressWarnings("unchecked")
	public ArrayList<HashMap<String, String>> readInfo() throws IOException {
		ArrayList<HashMap<String, String>>list=null;
		//初始化输入流对象
		try {
			//初始化输入流对象
			FileInputStream input=new FileInputStream("C:\\Users\\Administrator\\Desktop\\Java1807\\StudentInfo");
			//反序列化操作
			ObjectInputStream ois=new ObjectInputStream(input);
			//还原对象
			list=(ArrayList<HashMap<String, String>>) ois.readObject();
			if (list==null) {
				list=new ArrayList<>();
			}
			ois.close();
			input.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			list=new ArrayList<>();
		}
		return list;
	}
	
}
