java org.antlr.v4.Tool -no-listener -visitor SaplingAbt.g4

javac *.java

grun SaplingAbt zeeConfig -gui sample5.CONF
