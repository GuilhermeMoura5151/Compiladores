echo "A compilar a gramática..."
antlr4 program.g4
echo "A compilar os ficheiros necessários..."
javac *.java

echo "Escolha a forma de correr o programa:
por (c)omandos;
por (f)icheiro;"

read answer

if [ "$answer" == "c" ]
then 
	java programMain
else
	java programMainFile
fi	
python out.py
