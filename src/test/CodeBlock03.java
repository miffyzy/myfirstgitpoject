package test;

public class CodeBlock03{
    {
     System.out.println("CodeBlock03�Ĺ����");    
    }
    
    static{
       System.out.println("CodeBlock03�ľ�̬�����");
       }
       
       public CodeBlock03(){
            System.out.println("CodeBlock03�Ĺ��췽��");
           }
       
     public static void main(String[] args){
         System.out.println("CodeBlock03��������");
           new Code();
           new Code();
           new CodeBlock03();
           new CodeBlock03();
         }
   }

class Code{
    {
      System.out.println("Code�Ĺ����");
    }
    
    static{
        System.out.println("Code�ľ�̬�����");
        }
        
    public Code(){
        System.out.println("Code�Ĺ��췽��");
        }
    }


