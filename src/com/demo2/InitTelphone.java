package com.demo2;
public class InitTelphone
{
  public static void main(String[] args)
  {
    /*Telphone t1 = new Telphone();
    t1.cpu = 2.7f;
    t1.screen = 5.5f;
    t1.memory = 8.0f;
    t1.sendMsg();*/
    Telphone t1 = new Telphone();
    Telphone t2 = new Telphone(3.5f,5.6f,16.0f);
  }
}
