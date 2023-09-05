package com.capstone.example.capstone.components;


import com.capstone.example.capstone.models.Answer;
import com.capstone.example.capstone.models.Question;
import com.capstone.example.capstone.models.QuestionLevel;
import com.capstone.example.capstone.models.User;
import com.capstone.example.capstone.repositories.AnswerRepository;
import com.capstone.example.capstone.repositories.QuestionRepository;
import com.capstone.example.capstone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AnswerRepository answerRepository;
    @Autowired
    QuestionRepository questionRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {

//        User billy = new User(43, 450, "Billy", "King of Kong");
//        userRepository.save(billy);
//        User josie = new User(21, 300, "Josie", "I'm just a Golden Retriever");
//        userRepository.save(josie);
//        User steve = new User(6, 120, "Steve", "Developers developers developers develop...");
//        userRepository.save(steve);
//
//        //QUESTION 1
//
//        Question questionBeginner1 = new Question("What will the output be for: print(3 * 2)?", "You might have used a different symbol when you learned this in school", 1, 1, "We use '*' to multiply values, rather than 'x'");
//        questionRepository.save(questionBeginner1);
//        Question questionIntermediate1 = new Question("What will the following code output: print('apple' > 'Apple')?", "Think about how a computer might interpret a string.", 1, 2, "The ASCII value of 'a' is greater than that of 'A'.");
//        questionRepository.save(questionIntermediate1);
//        Question questionAdvanced1 = new Question("What is the main difference between a list and a tuple in Python?", "Think about possible advantages or disadvantages of a list", 1, 3, "Immutable means unchangeable. The contents and index positions of a tuple cannot be changed,");
//        questionRepository.save(questionAdvanced1);
//
//        Answer answerBeginner1 = new Answer("32 ", false, questionBeginner1);
//        answerRepository.save(answerBeginner1);
//        Answer answerBeginner2 = new Answer("6", true, questionBeginner1);
//        answerRepository.save(answerBeginner2);
//        Answer answerBeginner3 = new Answer("5 ", false, questionBeginner1);
//        answerRepository.save(answerBeginner3);
//
//        Answer answerIntermediate1 = new Answer("my_list[1, 1] ", false, questionIntermediate1);
//        answerRepository.save(answerIntermediate1);
//        Answer answerIntermediate2 = new Answer("my_list[1][1] ", true, questionIntermediate1);
//        answerRepository.save(answerIntermediate2);
//        Answer answerIntermediate3 = new Answer("my_list[2][1] ", false, questionIntermediate1);
//        answerRepository.save(answerIntermediate3);
//
//        Answer answerAdvanced1 = new Answer("A tuple is ordered, while a list is not. ", true, questionAdvanced1);
//        answerRepository.save(answerAdvanced1);
//        Answer answerAdvanced2 = new Answer("A tuple can contain duplicate items, while a list cannot.", false, questionAdvanced1);
//        answerRepository.save(answerAdvanced2);
//        Answer answerAdvanced3 = new Answer("A tuple is immutable, while a list is mutable.", false, questionAdvanced1);
//        answerRepository.save(answerAdvanced3);
//
//        // QUESTION 2
//
//        Question questionBeginner2 = new Question("What is the correct way to define a function in Python?", "The word define is important, but remember you may have to type this command multiple times!", 2, 1, "'def' is short for 'define'.");
//        questionRepository.save(questionBeginner2);
//        Question questionIntermediate2 = new Question("What is the purpose of the else clause in a Python for-loop?", "This is slightly different to it's purpose in an if/else statement", 2, 2, "The 'else' allows for us to define multiple potential outcomes for our loop.");
//        questionRepository.save(questionIntermediate2);
//        Question questionAdvanced2 = new Question("In Python's Flask, which decorator is commonly used to route URL patterns to functions?", "No hint today. Good luck!", 2, 3, "Well done!");
//        questionRepository.save(questionAdvanced2);
//
//
//        Answer answerBeginner4 = new Answer("Multiplies numbers", false, questionBeginner2);
//        answerRepository.save(answerBeginner4);
//        Answer answerBeginner5 = new Answer("Calculates the length of an object", true, questionBeginner2);
//        answerRepository.save(answerBeginner5);
//        Answer answerBeginner6 = new Answer("Converts a number to a string", false, questionBeginner2);
//        answerRepository.save(answerBeginner6);
//
//        Answer answerIntermediate4 = new Answer("List of all numbers from 0 to 10", false, questionIntermediate2);
//        answerRepository.save(answerIntermediate4);
//        Answer answerIntermediate5 = new Answer("List of odd numbers from 0 to 9", false, questionIntermediate2);
//        answerRepository.save(answerIntermediate5);
//        Answer answerIntermediate6 = new Answer("List of even numbers from 0 to 9", true, questionIntermediate2);
//        answerRepository.save(answerIntermediate6);
//
//        Answer answerAdvanced4 = new Answer("216", true, questionAdvanced2);
//        answerRepository.save(answerAdvanced4);
//        Answer answerAdvanced5 = new Answer("108", false, questionAdvanced2);
//        answerRepository.save(answerAdvanced5);
//        Answer answerAdvanced6 = new Answer("54", false, questionAdvanced2);
//        answerRepository.save(answerAdvanced6);
//
//
//        // QUESTION 3
//        Question questionBeginner3 = new Question("Which of the following is an infinite loop?", "Think about a value you cannot change", 3, 1, "'1' will always exist, so checking it's existence will always return true.");
//        questionRepository.save(questionBeginner3);
//        Question questionIntermediate3 = new Question("What will the following code return: type(lambda x: x+1)?", "Think first about what 'type' normally returns. Then think about the purpose of 'lambda.'", 3, 2, "'lamda' is an anonymous function. So it's type is 'function'.");
//        questionRepository.save(questionIntermediate3);
//        Question questionAdvanced3 = new Question("What does the map function do in Python?", "This would be useful if you wanted to create a new list", 3, 3, "'map' allows us to perform a function on every value within a list, and return the results in a new list.");
//        questionRepository.save(questionAdvanced3);
//
//        Answer answerBeginner7 = new Answer("1", true, questionBeginner3);
//        answerRepository.save(answerBeginner7);
//        Answer answerBeginner8 = new Answer("3.3", false, questionBeginner3);
//        answerRepository.save(answerBeginner8);
//        Answer answerBeginner9 = new Answer("10", false, questionBeginner3);
//        answerRepository.save(answerBeginner9);
//
//        Answer answerIntermediate7 = new Answer("<type 'function'>", true, questionIntermediate3);
//        answerRepository.save(answerIntermediate7);
//        Answer answerIntermediate8 = new Answer("<type 'lambda'>", false, questionIntermediate3);
//        answerRepository.save(answerIntermediate8);
//        Answer answerIntermediate9 = new Answer("<type 'int'>", false, questionIntermediate3);
//        answerRepository.save(answerIntermediate9);
//
//        Answer answerAdvanced7 = new Answer("Maps a function over an iterable.", true, questionAdvanced3);
//        answerRepository.save(answerAdvanced7);
//        Answer answerAdvanced8 = new Answer("Searches for an element in a list.", false, questionAdvanced3);
//        answerRepository.save(answerAdvanced8);
//        Answer answerAdvanced9 = new Answer("Converts one data type into another.", false, questionAdvanced3);
//        answerRepository.save(answerAdvanced9);
//
//
//        // QUESTION 4
//        Question questionBeginner4 = new Question("How do you create a dictionary in Python?", "Think carefully about the placement of commas and colons", 4, 1, "Dictionary keys and values are seperated by colons and contained within curly brackets");
//        questionRepository.save(questionBeginner4);
//        Question questionIntermediate4 = new Question("Which of the following will raise an exception?", "Think carefully about data types.", 4, 2, "In Python, we cannot add a string to an integer without first converting one to the other.");
//        questionRepository.save(questionIntermediate4);
//        Question questionAdvanced4 = new Question("What will the expression [1, 2, 3] * 2 produce in Python?", "What is the '*2' doing? What value is it working with?", 4, 3, "The list itself is multiplied by 2, not the values within.");
//        questionRepository.save(questionAdvanced4);
//
//        Answer answerBeginner10 = new Answer("{ key : value }", true, questionBeginner4);
//        answerRepository.save(answerBeginner10);
//        Answer answerBeginner11 = new Answer("(key, value)", false, questionBeginner4);
//        answerRepository.save(answerBeginner11);
//        Answer answerBeginner12 = new Answer("[key, value]", false, questionBeginner4);
//        answerRepository.save(answerBeginner12);
//
//        Answer answerIntermediate10 = new Answer("'12' + '34'", false, questionIntermediate4);
//        answerRepository.save(answerIntermediate10);
//        Answer answerIntermediate11 = new Answer("['1', '2'] + ['3', '4']", false, questionIntermediate4);
//        answerRepository.save(answerIntermediate11);
//        Answer answerIntermediate12 = new Answer("'12' + 34", true, questionIntermediate4);
//        answerRepository.save(answerIntermediate12);
//
//        Answer answerAdvanced10 = new Answer("True", true, questionAdvanced4);
//        answerRepository.save(answerAdvanced10);
//        Answer answerAdvanced11 = new Answer("False", false, questionAdvanced4);
//        answerRepository.save(answerAdvanced11);
//        Answer answerAdvanced12 = new Answer("Error", false, questionAdvanced4);
//        answerRepository.save(answerAdvanced12);
//
//
//        //QUESTION 5
//        Question questionBeginner5 = new Question("What does the 'len()' function do?", "This would be very helpful with a list", 5, 1, "len() is short for length.");
//        questionRepository.save(questionBeginner5);
//        Question questionIntermediate5 = new Question("How would you access the second element of a nested list my_list = [[1,2],[3,4]]?", "Think about what the first index position of any list is.", 5, 2, "'1' is actually the second index position of any list. So [1][1] will take us to the second position of the second list.");
//        questionRepository.save(questionIntermediate5);
//        Question questionAdvanced5 = new Question("What will print(2 * 3 ** 3 * 2) display?", "There is a power operator here.", 5, 3, "The power operator will run first, before the multiplication.");
//        questionRepository.save(questionAdvanced5);
//
//
//        Answer answerBeginner13 = new Answer("define function_name():", false, questionBeginner5);
//        answerRepository.save(answerBeginner13);
//        Answer answerBeginner14 = new Answer("func function_name():", false, questionBeginner5);
//        answerRepository.save(answerBeginner14);
//        Answer answerBeginner15 = new Answer("def function_name():", true, questionBeginner5);
//        answerRepository.save(answerBeginner15);
//
//        Answer answerIntermediate13 = new Answer("False", false, questionIntermediate5);
//        answerRepository.save(answerIntermediate13);
//        Answer answerIntermediate14 = new Answer("True", true, questionIntermediate5);
//        answerRepository.save(answerIntermediate14);
//        Answer answerIntermediate15 = new Answer("Error", false, questionIntermediate5);
//        answerRepository.save(answerIntermediate15);
//
//        Answer answerAdvanced13 = new Answer("@route('/')", true, questionAdvanced5);
//        answerRepository.save(answerAdvanced13);
//        Answer answerAdvanced14 = new Answer("@url('/')", false, questionAdvanced5);
//        answerRepository.save(answerAdvanced14);
//        Answer answerAdvanced15 = new Answer("@path('/')", false, questionAdvanced5);
//        answerRepository.save(answerAdvanced15);
//
//
//        //QUESTION 6
//        Question questionBeginner6 = new Question("What is the result of 12 / 3?", "Think about what happens when you divide 10 by 3.", 6, 1, "The modulus, or '%', tells us what integer is left over when one integer is divided by the other.");
//        questionRepository.save(questionBeginner6);
//        Question questionIntermediate6 = new Question("What does the list comprehension [x for x in range(10) if x % 2 == 0] produce?", "Think about which values would correspond with 'x % 2 == 0'", 6, 2, "Starting at 0, only the even numbers between 0 and 9 will have no remainder if divided by 2");
//        questionRepository.save(questionIntermediate6);
//        Question questionAdvanced6 = new Question("What will print(all([True, 1, {3}])) display?", "Think about what all three parameters have in common.", 6, 3, "The all() function returns 'true' if parameters are true.");
//        questionRepository.save(questionAdvanced6);
//
//
//        Answer answerBeginner16 = new Answer("while False:", false, questionBeginner6);
//        answerRepository.save(answerBeginner16);
//        Answer answerBeginner17 = new Answer("while 1:", true, questionBeginner6);
//        answerRepository.save(answerBeginner17);
//        Answer answerBeginner18 = new Answer("while 'a' > 'b':", false, questionBeginner6);
//        answerRepository.save(answerBeginner18);
//
//        Answer answerIntermediate16 = new Answer("It always executes after the loop finishes, regardless of how the loop exits.", false, questionIntermediate6);
//        answerRepository.save(answerIntermediate16);
//        Answer answerIntermediate17 = new Answer("It executes if the loop condition was never True.", false, questionIntermediate6);
//        answerRepository.save(answerIntermediate17);
//        Answer answerIntermediate18 = new Answer(" It executes only if the loop finished without encountering a break statement.", true, questionIntermediate6);
//        answerRepository.save(answerIntermediate18);
//
//        Answer answerAdvanced16 = new Answer("[1, 2, 3, 1, 2, 3]", true, questionAdvanced6);
//        answerRepository.save(answerAdvanced16);
//        Answer answerAdvanced17 = new Answer("[2, 4, 6]", false, questionAdvanced6);
//        answerRepository.save(answerAdvanced17);
//        Answer answerAdvanced18 = new Answer("Error", false, questionAdvanced6);
//        answerRepository.save(answerAdvanced18);
//
//
//        //QUESTION 7
//        Question questionBeginner7 = new Question("How do you convert a string to an integer in Python?", "Think about which value should be used as an argument.", 0, 1, "The string would be used as an argument, and the result of the function will be an integer");
//        questionRepository.save(questionBeginner7);
//        Question questionIntermediate7 = new Question("How do you delete a key-value pair from a dictionary d with a key k?", "Think about how you would normally access a value in a dictionary.", 0, 2, "'del' is a keyword in python used to delete specific objects.");
//        questionRepository.save(questionIntermediate7);
//        Question questionAdvanced7 = new Question("Which one is not a valid way to create an empty set in Python?", "Think about how you might create other objects in python.", 0, 3, "'set()' is a function that creates a set. '{}' creates a new empty set.");
//        questionRepository.save(questionAdvanced7);
//
//        Answer answerBeginner19 = new Answer("int(string)", true, questionBeginner7);
//        answerRepository.save(answerBeginner19);
//        Answer answerBeginner20 = new Answer("string.to_i()", false, questionBeginner7);
//        answerRepository.save(answerBeginner20);
//        Answer answerBeginner21 = new Answer("string(1)", false, questionBeginner7);
//        answerRepository.save(answerBeginner21);
//
//        Answer answerIntermediate19 = new Answer("del d.k", false, questionIntermediate7);
//        answerRepository.save(answerIntermediate19);
//        Answer answerIntermediate20 = new Answer("d.remove(k)", false, questionIntermediate7);
//        answerRepository.save(answerIntermediate20);
//        Answer answerIntermediate21 = new Answer("del d[k]", true, questionIntermediate7);
//        answerRepository.save(answerIntermediate21);
//
//        Answer answerAdvanced19 = new Answer("set()", false, questionAdvanced7);
//        answerRepository.save(answerAdvanced19);
//        Answer answerAdvanced20 = new Answer("{}", false, questionAdvanced7);
//        answerRepository.save(answerAdvanced20);
//        Answer answerAdvanced21 = new Answer("set{}", true, questionAdvanced7);
//        answerRepository.save(answerAdvanced21);
    }
}

