public class Main {
    public static void main(String[] args)
    {

      String str ="MOBILE PHONE IS DEAD";
      int length = str.length();
        char [] ch2 = new char[length];
      char [] ch = str.toCharArray();
      int [] arr = new int[length];
      for(int i=0;i<length;i++)
      {
          if(ch[i]!='A'&&ch[i]!='E'&&ch[i]!='I'&&ch[i]!='O'&&ch[i]!='U')
          {
              System.out.print(ch[i]);
             continue;
          }
      }
//      for(int i=0;i<ch2.length;i++)
//      {
//          System.out.print(ch2[i]);
//      }

    }
}