.PHONY: build

testbuild: build
	java -jar Spiel.jar

build: Spiel.class
	jar cvfm Spiel.jar manifest.txt project/Spiel.class project/Player.class project/WurfStatistik.class project/WurfStatistikImplementation.class project/ThreadpoolBasedGame.class

test: Spiel.class
	java project.Spiel

Spiel.class: project/Spiel.java project/Player.java project/WurfStatistik.java project/WurfStatistikImplementation.java project/ThreadpoolBasedGame.java
	javac project/Spiel.java project/Player.java project/WurfStatistik.java project/WurfStatistikImplementation.java project/ThreadpoolBasedGame.java
