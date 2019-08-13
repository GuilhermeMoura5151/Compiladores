grammar program;

run: 
	scheme* EOF;

scheme:
	operations
	| assign
	| NEWLINE
	;

operations: 
	show NEWLINE
	| resize NEWLINE
	| rotate NEWLINE
	| canny NEWLINE
	| blur NEWLINE
	| blend NEWLINE
	| save NEWLINE
	;

assign:
	VAR ' = ' operations #assignOperation
	| VAR ' = ' IMAGE #assignImage
	| VAR ' = ' VAR #assignVar
	;
	
show:
	'show ' IMAGE #showImage
	| 'show ' VAR #showVar
	;	
	
resize:
	'resize ' IMAGE ' ' INT ', ' INT #resizeImage
	| 'resize ' VAR ' ' INT ', ' INT #resizeVar
	;
	
rotate:
	'rotate ' IMAGE ' ' INT #rotateImage
	| 'rotate ' VAR ' ' INT #rotateVar
	;
	
canny:
	'canny ' IMAGE #cannyImage
	| 'canny ' VAR #cannyVar
	; 

blur:
	'blur ' IMAGE #blurImage
	|'blur ' VAR #blurVar
	;

blend:
	'blend ' IMAGE ', ' IMAGE #blendImage
	| 'blend ' IMAGE ', ' VAR #blendImageVar
	| 'blend ' VAR ', ' IMAGE #blendVarImage
	| 'blend ' VAR ', ' VAR #blendVar
	;

save:
	'save ' IMAGE #saveImage
	| 'save ' VAR #saveVar;
	
IMAGE: WORD FORMAT; 

INT: [0-9]+;
VAR: [a-z]+;
WORD: [a-zA-Z0-9]+;
FORMAT:	'.bmp'
	|'.dib'
	|'.jpeg'
	|'.jpg'
	|'.jpe'
	|'.jp2'
	|'.png'
	|'.webp'
	|'.pbm'
	|'.pgm'
	|'.ppm'
	|'.sr'
	|'.ras'
	|'.tiff'
	|'.tif';

NEWLINE: '\r'? '\n';
