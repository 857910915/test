package day14.regex;

public class RegexDemo1 {
	
	public static void main(String[] args) {
		//1.split 分割
		String str="饮酒行令11，是中国人在饮酒时44助兴的一种特有方式qq，最早诞生于西周，完备于隋唐。";
		//2.以逗号进行分割
		//String reg="，";
		//以叠词进行分割
		String reg="(.)\\1";
		//3.分割
		String[]list=str.split(reg);
		for (String tmp : list) {
			System.out.println(tmp);
		}
		//替换 replace
		//替换叠词
		reg="(.)\\1+";
		str=str.replaceAll(reg,"java" );
		System.out.println(str);
		
		
	}
}
