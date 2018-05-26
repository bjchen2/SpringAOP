# SpringAOP
**探秘Spring AOP chap2代码**<br/>

**建议先看2.7再看2.3,老师上传视频的时候顺序好像弄错了**<br/>
**其中，cglib，chainNormal，chainPattern，jdkDynamic，pattern包是第三章（Spring AOP的实现原理）的代码，第二章学习时可忽略**<br/>


- 第二章<br/>
&emsp;视频中老师忘记强调了，使用args()/@target()和@args()必须指定需要扫描的类的范围，如视频中within指定，或者bean，this，target都行，反正必须说明要在哪些类里拦截，不然会报错<br/>

- 第三章<br/>
&emsp;关于第三章：有兴趣或者没弄懂的可以看慕课网代理模式和责任链模式：<br/>
&emsp;&emsp;责任链模式： https://www.imooc.com/learn/257<br/>
&emsp;&emsp;代理模式： https://www.imooc.com/learn/214<br/>

- 关于SpringAOP的代码实现<br/>
&emsp;参考资料：<br/>
&emsp;&emsp;https://www.imooc.com/learn/869<br/>

- **代码完成于：2018-05-26**<br/>
  &emsp;JDK：JDK1.8版本，<br/>
  &emsp;IDE：IDEA 2017.3.3，<br/>
  &emsp;操作系统为：Windows10<br/>
  &emsp;SpringBoot：2.0.2.RELEASE<br/>
  
- 使用lombok包，减少代码冗余量，若不愿使用lombok包可将源码中所有bean的@Data注解去掉，加上get/set方法<br/>
