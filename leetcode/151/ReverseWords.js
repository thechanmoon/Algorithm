console.log(reverseWords("the sky is blue"));

function reverseWords(s) {
    // let array = s.split(" ");
    // let retString ="";
    // for (let i = array.length - 1; i > -1; i--) {
    //     retString = retString+array[i];
    //     if(i != 0)
    //         retString = retString + " ";
    // }
    // return retString;

    // let array = s.split(" ").reverse();
    // let retString ="";
    // for (let i = 0; i < array.length; i++) {
    //     retString = retString+array[i];
    //     if(i != array.length-1)
    //         retString = retString + " ";
    // }
    // return retString;

	var words = s.split(" ").reverse(); // Split the sentence into an array of words and reverse it
	var string = "";
    for(word in words)
    {
        string += (word > 0 ? " " : "") + words[word]; // Concatenate each word to the output and add spaces where required
    }
    return string;
}
