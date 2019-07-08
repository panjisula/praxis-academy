//import events module
var events = require('events');

//membuat object event emitter
var eventEmitter = new events.EventEmitter();

//membuat sebuah event handler as follows
var connectHandler = function connected() {
    console.log('connection successful.');

    //Fire the data_received event
    eventEmitter.emit('data_received');
}

//bind the connection event with the handler
eventEmitter.on('connection', connectHandler);

//bind the data_received event with the anonymous function
eventEmitter.on('data_received', function() {
    console.log('data reveived succesfully.')
});

//fire the connection event
eventEmitter.emit('connection');

console.log("Program Ended.");