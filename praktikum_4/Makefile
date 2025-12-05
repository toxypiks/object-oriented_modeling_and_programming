.PHONY: build

testbuild: build
	java -jar TestBinarySearchTree.jar

build: TestBinarySearchTree.class
	jar cvfm TestBinarySearchTree.jar manifest.txt project/TestBinarySearchTree.class project/BinarySearchTreeNode.class project/BinarySearchTree.class 

test: TestBinarySearchTree.class
	java project.TestBinarySearchTree

TestBinarySearchTree.class: project/TestBinarySearchTree.java project/BinarySearchTreeNode.java project/BinarySearchTree.java
	javac project/TestBinarySearchTree.java project/BinarySearchTreeNode.java project/BinarySearchTree.java 
