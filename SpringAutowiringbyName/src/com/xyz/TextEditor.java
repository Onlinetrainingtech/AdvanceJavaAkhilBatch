package com.xyz;

public class TextEditor 
{
   private SpellChecker spellChecker;
   
   private String name;//using the variable as byName
   
   //public String name;

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	System.out.println(name);
}
   
   public void spellCheck()
   {
	   spellChecker.checkSpelling();
   }
}
