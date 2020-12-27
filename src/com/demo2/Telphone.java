package com.demo2;
public class Telphone
{
   float cpu;
   float screen;
   float memory;

  public Telphone(){
    System.out.println("����Telphone����޲ι��췽��");
  }

  public Telphone(float newCpu,float newScreen,float newMemory){
    System.out.println("����Telphone����вεĹ��췽��");
    cpu = newCpu;
    screen = newScreen;
    memory = newMemory;
    System.out.println("cpu:"+ cpu+"; screen:"+ screen+"; memory:"+ memory);
  }

  public void sendMsg()
  {
    //Telphone t1 = new Telphone();
    System.out.println("cpu:"+ cpu+"; screen:"+ screen+"; memory:"+ memory);
  }
}
