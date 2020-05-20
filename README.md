# graalvm-example



1.设置JDK环境或者以上版本

```
graalvm-ce-java11-20.1.0
```

2.环境是maven3

3.生成运行时代码

```
mvn package
```

4.JVM启动参数

```
启动类
cn.lightfish.MathMain

-Dtruffle.class.path.append=language\target\language.jar
```

language\target\language.jar是生成的语言包