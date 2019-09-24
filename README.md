# java13-examples
Java 13 Examples

java --enable-preview -Xlog:class+load=info com.dariawan.jdk13.JEP353 | findStr Socket
java --enable-preview -Xlog:class+load=info -Djdk.net.usePlainSocketImpl com.dariawan.jdk13.JEP353 | findStr Socket