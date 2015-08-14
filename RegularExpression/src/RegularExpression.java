import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpression {
	 static int Num = 1;

	public static void main(String[] args) {
		//����ʶ������ʽ�ĸ��
		/*
		 * 
		p("[a-z]{2}".matches("au"));
		p("au".matches("[a-z]{2}"));
		Pattern p = Pattern.compile("[a-z]{4}");
		Matcher m = p.matcher("arwf");
		p(m.matches());
		p("bfsafk".matches("......"));*/

		
		//����ʶ .  ? * + 
		/*
		p("a".matches("a"));
		p("a".matches("."));
		p("aa".matches("a*"));
		p("aa".matches("a?"));
		p("aaaa".matches("a+"));
		p("".matches("a?"));
		p("".matches("a*"));
		p("".matches("a+"));
		p("192.168.1.l".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
		p("156".matches("[1-2][0-9][0-9]"));
		*/
		
		//��Χ
		
		p("a".matches("[asdf]"));
		p("a".matches("[a-z]"));
		
		//|| 's three form
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z]|[A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		
		//&&
		p("a".matches("[a-z&&[abt]]"));
		
		
		//��ʶ d s w D S W
		/*
		p("\n\r\t".matches("\\s{3}")); //�հ��ַ���[ \t\n\x0B\f\r]
		p("".matches("\\S"));
		p("wkfsnk_j897534".matches("\\w+"));
		p("fjksl_jfks".matches("\\W"));
		p("sdj8953$%#^^&".matches("[a-z]{3}\\d+[#$%^^&%#]+"));
		p("\\".matches("\\\\"));
		*/

		//boundary
		/*
		p("hello sir".matches("^j.*"));
		p("hello sir".matches("^h.*"));
		p("hello sir".matches(".*ir$"));
		p("hello sir".matches(".*i$"));
		p("hello sir".matches("^h[a-z]{3}o\\b.*"));
		p("hellosir".matches("^h[a-z]{3}o\\b.*"));
		*/
		//white lines
/*
		p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
		//��ͷ����һ���հ׷������ǻ��з�����������߶�Ρ���β���ǻ��з���
		//p(" \n".matches("^[\\s&&[^\\n]]*\\n$"));
*/	
		
		//ƥ��E-mail ��ַ��������ʽ��ϰ
	/*	
		p("40716740@qq.com".matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
	*/	
		
		
		//��ʶmatches find lookingAt
		//����matches ��Զƥ�������ַ���,find �������ַ������ҷ��ϵ��Ӵ�,lookingAt �ص�һ���ַ���ʼƥ��;
		//find lookingAt ����Matcher��ķ���;
		//matches�� String ��Matcher���涼��;
		/*
		Pattern p = Pattern.compile("\\d{3,5}");
		String s = "123-456-678-9";
		Matcher m = p.matcher(s);
		p(m.matches());//�жϴ���
		m.reset(); //���ù��?
		p(m.find());
		p(m.start() + "---" +m.end());//��ʾ�ҵ��ִ���λ��
		p(m.find());
		p(m.start() + "---" +m.end());
		p(m.find());
		p(m.start() + "---" +m.end());
		p(m.find());
		p(m.find());
		
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());
		p(m.lookingAt());
		*/
		
		//Replacement
		
		/*
		Pattern p = Pattern.compile("java",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher("Java java JavA JAVa jaVa loveJaVa hateJAVa ksjdfklsfs");
		p(m.find());
		
		m.reset();
		while(m.find()){
			p(m.replaceAll("JAVA"));
		}
		m.reset();
		
		StringBuffer buf = new StringBuffer();
		int Num =0;
		while(m.find()){
			Num++;
			if(Num%2 == 0){
				m.appendReplacement(buf, "java");
			}else{
				m.appendReplacement(buf, "JAVA");
			}
		}
		m.appendTail(buf);//��û��ƥ�䵽���ַ��ӵ�buf����ȥ
		p(buf);*/
		
/*		String s = "123.fhjsk";
		//Pattern p = Pattern.compile("(^\\w+)(\\.[a-z[A-Z]]+$)");
		Pattern p = Pattern.compile("\\.[a-z[A-Z]]+$");
		Matcher m = p.matcher(s); 
		if(m.find()){
			//m.replaceAll(".java");
			System.out.println(m.replaceAll(".java"));
		}
		*/
		//group
		/*
		Pattern p = Pattern.compile("(\\d{3,5})([a-z]{2})");
		Matcher m = p.matcher("123ae-456re-986nh-gt45-123ds");
		while(m.find()){
			p(m.group(1));
		}*/
		
		
		//quantifier
		//����֮���ټӣ�+�������ڵ���˼
		//".{3,10}+[0-9]"����һ��������ȥ���ģ������³��� [0,9]����ȥ,����0�����9��
		//".{3,10}?[0-9]"����һ��������ȥ���ٵģ������³���
		/*
		Pattern p = Pattern.compile(".{3,10}+[0-9]");
		Matcher m = p.matcher("asdf3djkn50");
		if(m.find()){
			String s = m.start() + "-" + m.end();	
			p(s);
		}else{
			p("not match!");
		}	*/
		
		//non-capturing group ��������
		//".{3}"
		//"(?=e).{3}" ��e��ͷ���ַ�e��һ�� 
		//".{3}(?=e)" ��e��β���ַ�����3�����е�һ���������ǵ��ĸ�
		//����ģ�������û�У�����ֻ�Ƿ��㿴�������
		
/*		Pattern p = Pattern.compile(".{3}(?=e)");
		Matcher m = p.matcher("123e52e");
		while(m.find()){
			p(m.group());
		}*/
	
	}
	
	public static void p (boolean b){
		
		System.out.print(Num);
		System.out.print("  ");
		System.out.print(b);
		System.out.println();
		Num++;
	}
}
