// 1. You've written the event listener shown for a form button, but each time you click the button, the page reloads.Which state would stop this from happening.
// button.addEventListener('click',function(e){button.className = 'clicked';},false);
// e.preventDefautl();

// 2. Which statement references the DOM node created by the code shown?
// <p class="pull">lorem ipsum</p>
// document.querySelector('.pull');

// 3. Which statement is the correct way to create a variable called rate and assign it the value 100?
// let rate = 100;

// 4. When would the final statement in the code shown be logged tot the console?
// let modal = document.querySelector("#result");
// setTimeout(function(){
//     modal.classList.remove('hidden');
// },100000);
// console.log('Result shown')?
//immediateley

// 5 Which statement creates a new object using the Person constructor?
// var student = new personalbar();

// 6 When would you use a conditional statement?
// When you want your code to choose between multiple options.

// 7 How is a forEach statement different from a for statement?
// A for statement is generic but a forEach statement cat be used only with an array.


// 8 You've written the code shown to log a set of consecutive values, but it instead results in the values 5,5,5 and 5 being logged to the console. Which revised version of the code would result int the value 1,2,3 and 4 being logged?
for(var i = 1; i <= 4; i++)
{
    setTimeout(function(){
        console.log(i);
    },i*10000);
}
