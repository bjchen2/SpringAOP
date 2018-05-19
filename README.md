# SpringAOP
慕课网，探秘Spring AOP代码实现<br/>

**老师1.2节演示讲解有误，已在代码中改出，第一章代码已上传到dev1分支**<br/>
首先测试类里，不要捕获异常，不然不能检测出错（因为异常都被捕获了，所以测试永远都通过）<br/>
其次ProductService中insert和delete需要加上@AdminOnly注解，不然切面没法织入，不懂的建议先了解下切点的概念<br/>

- 关于SpringAOP的代码实现<br/>
&emsp;参考资料：<br/>
&emsp;&emsp;https://www.imooc.com/learn/869<br/>

- **代码写于：2018-05-19**<br/>
  &emsp;JDK：JDK1.8版本，<br/>
  &emsp;IDE：IDEA 2017.3.3，<br/>
  &emsp;操作系统为：Windows10<br/>
  &emsp;SpringBoot：2.0.2.RELEASE<br/>
  
- 使用lombok包，减少代码冗余量，若不愿使用lombok包可将源码中所有bean的@Data注解去掉，加上get/set方法<br/>
