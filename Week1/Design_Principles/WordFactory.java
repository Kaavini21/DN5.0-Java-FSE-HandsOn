package FactoryMethodPattern;

public class WordFactory extends DocumentFactory {
	@Override
	public WordDocument createDocument() {
		return new WordDocument();
	}
}
