decodeMorse = function(morseCode){
//your code here
morseCode = morseCode.trim();

     var tempCharacter ='';
     var tempWord = '';
     var finalPhrase = '';
     var lenghtValue = morseCode.length;

  for(i = 0; i <= lenghtValue; i++){
//      checking if not blanck character
     if(morseCode.charAt(i) !== ' ' ){
        tempCharacter = tempCharacter + morseCode.charAt(i);
        if(i == lenghtValue){
          console.log(tempCharacter);
          tempWord = tempWord + MORSE_CODE[tempCharacter];
          console.log(tempWord);
          tempCharacter = '';
          if(finalPhrase == ''){
          finalPhrase = finalPhrase + tempWord;
          }else{
          finalPhrase = finalPhrase + ' ' + tempWord;
          }
        }
     }else{
        if((lenghtValue - i) >=3 && morseCode.charAt(i) == ' ' && morseCode.charAt(i + 1) == ' ' && morseCode.charAt(i + 2) == ' '){
             console.log(tempCharacter);
             tempWord = tempWord + MORSE_CODE[tempCharacter];
             console.log(tempWord);
             tempCharacter = '';
             if(finalPhrase == ''){
                finalPhrase = finalPhrase + tempWord;
            }else{
              finalPhrase = finalPhrase + ' ' + tempWord;
            }
             tempWord = '';
             i = i +2;
        }else{
         console.log(tempCharacter);
         tempWord = tempWord + MORSE_CODE[tempCharacter];
         console.log(tempWord);
         tempCharacter = '';
       }
     }
  }
  return finalPhrase;
}

MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .");