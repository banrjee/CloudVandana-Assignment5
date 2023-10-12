function reverseWords(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}
const inputSentence = prompt("Enter a sentence:");
if (inputSentence !== null) { 
    const reversedSentence = reverseWords(inputSentence);
    alert("Reversed Sentence: " + reversedSentence);
}

