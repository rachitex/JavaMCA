/* Program to show the usage of if else ladder */
class Prog4{
  public static void main(String args[]){
    int subject1=27,subject2=27,subject3=27;
    int total=subject1+subject2+subject3;
    int per=total/3;

    if(per<69 && per>=40){
      System.out.println("Passed with "+per+" %");
    }else if(per>70){
      System.out.println("Passed with distinction & "+per+" %");
    }else if(per<40){
      System.out.println("Fail");
    }/*else{
      System.out.println("Hey");
    }*/
  }
}
