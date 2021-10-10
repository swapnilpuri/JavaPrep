package com.dp.visitor;

abstract class FileVisitor {
	abstract void visitWord(WordFile file);
	abstract void visitPicture(PictureFile file);
}

class FilePrintVisitor extends FileVisitor{
	
	@Override void visitWord(WordFile file) {
		System.out.println("Print Word File");
	}
	
	@Override void visitPicture(PictureFile file) {
		System.out.println("Print Picture File");
	}
}

abstract class File {
	abstract void visit(FileVisitor fileVisitor); 
}

class WordFile extends File {
	@Override
	void visit(FileVisitor fileVisitor) {
		fileVisitor.visitWord(this);
	}
}

class PictureFile extends File {
	@Override
	void visit(FileVisitor fileVisitor) {
		fileVisitor.visitPicture(this);
	}
}

class Test {
	public static void main(String[] args) {
		File[] files = {new WordFile(), new PictureFile()};
		FileVisitor filePrintVisitor = new FilePrintVisitor();
		for(File file : files) {
			file.visit(filePrintVisitor);
		}
	}
}
