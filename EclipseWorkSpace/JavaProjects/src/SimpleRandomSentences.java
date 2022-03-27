
public class SimpleRandomSentences {
	


String conjunction() //CONJUNCTION BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;
		
		switch(randomNum)
		{
		case 1:
			return " and";
		case 2:
			return " or";
		case 3:
			return " but";
		case 4:
			return " because";
		}
		
	
return "-1";
	} //CONJUNCTION END

String properNoun() //PROPER NOUN BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;

		switch(randomNum)
		{
		case 1:
			return " Fred";
		case 2:
			return " Jane";
		case 3:
			return " Richard Nixon";
		case 4:
			return " Miss America";
		
		}
		
		
return "-1";
	} //PROPER NOUN BEGIN



String commonNoun() //COMMAN NOUN BEGIN
{ 

		int randomNum =	(int)(Math.random() * 5 )+1;

	    switch(randomNum)
		{
		case 1:
			return determiner()+" man";
		case 2:
			return  determiner()+" woman";
		case 3:
			return  determiner()+" fish";
		case 4:
			return  determiner()+" elephand";
		case 5:
			return  determiner()+" unicorn";
		
		}
		
		
return "-1";
	} //COMMAN NOUN BEGIN


String determiner() //DETERMINER BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;
	
		switch(randomNum)
		{
		case 1:
			return " a "+adjective();
		case 2:
			
			return " the "+adjective();
		case 3:
			return " every "+adjective();
		case 4:
			return " some "+adjective();
		}
		
		
		
return "-1";
	} //DETERMINER BEGIN


String adjective() //adjective BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;
	
		switch(randomNum)
		{
		case 1:
			return "big";
		case 2:
			return "tiny";
		case 3:
			return "pretty";
		case 4:
			return "bald";
		}
		
		
return "-1";
	} //adjective BEGIN

String intransitiveVerb() //intransitive BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;
	
		switch(randomNum)
		{
		case 1:
			return "runs";
		case 2:
			return "jumps";
		case 3:
			return "talks";
		case 4:
			return "sleeps";
		}
		
		
return "-1";
	} //transitive BEGIN

	
String transitiveVerb() //intransitive BEGIN
{ 

		int randomNum =	(int)(Math.random() * 6 )+1;

		
		switch(randomNum)
		{
		case 1:
			return "loves"+" "+properNoun();
		case 2:
			return "hates"+" "+properNoun();
		case 3:
			return "sees"+" "+properNoun();
		case 4:
			return "knows"+" "+properNoun();
		case 5:
			return "looks for"+" "+properNoun();
		case 6:
			return "finds"+" "+properNoun();
		}
			
return "-1";
	} //transitive BEGIN




String verb() //verb BEGIN
{ 

		int randomNum =	(int)(Math.random() * 4 )+1;
	
		switch(randomNum)
		{
		case 1:
			return intransitiveVerb();
		case 2:
			return transitiveVerb();
		case 3:
			return "is "+adjective();
		case 4:
			return "believe that "+simpleSentence();
	
		}
			
return "-1";
	} //verb BEGIN


	
		

String simpleSentence() 
{//simpleSentence BEGIN
	int randomNum = (int)(Math.random() * 2)+1;

	
	switch(randomNum)
	{
	case 1:
		return properNoun()+ " "+verb();
	case 2:
		return commonNoun()+ " "+verb();

	}
return "-1";		
	
}//simpleSentence BEGIN

String sentence() 
{//simpleSentence BEGIN
	int randomNum = (int)(Math.random() * 2)+1;
	
	return simpleSentence()+""+conjunction()+""+simpleSentence();
	

	/*
	switch(randomNum)
	{
	case 1:
		return properNoun()+ " "+verb();
	case 2:
		return commonNoun()+ " "+verb();

	}
	*/
	
		
	
}//simpleSentence BEGIN







}
