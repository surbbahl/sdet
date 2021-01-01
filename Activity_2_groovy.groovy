
class Activity_2_groovy {
	public static void main (def args)
	{ 
		File file=new File("C:\\Users\\surbh\\OneDrive\\Desktop\\Groovy\\input.txt")
		file.createNewFile();
		def input_text="A quick brown Fox jumped oven the lazy Cow\nJohn Jimbo jingled happily ever after Th1\$ \$ v3ry c0nfusi1ng";
		file.write(input_text);
		//Question1
		file.eachLine { line->
			if (line==~/^.*Cow$/)
			{
					println "line ending with Cow is  $line"
					
			}
		}
		//Questio2
			file.eachLine { line->
				if (line==~/^J.*$/)
				{ println(line)}
					
				}
				
		//Question3
				file.eachLine { line->
					if (line==~/.*\d\d.*/)
					{ println(line)}
						
					}
		//Question4
				file.eachLine { line->
				def match1=file.getText()=~/\S+er/
				println("String mathcing are ${(match1.findAll())}")
				}
		//Question5
				def match2=file.getText()=~/\S*\d\W/
				println("String mathcing are ${(match2.findAll())}")
		
				
				
	}}
