const MongoClient = require('mongodb').MongoClient;

MongoClient.connect('mongodb://localhost:27017/Vignan', function(err, db){

  if(err){
    return console.log('unable to connect');

  }
  console.log('connected to mongodb server');

  db.collection('Vignan').insertOne({
    text: 'Welcome to MongoDB',
    completed: true,
    name : 'Vignan'
  }, (err, result)=>{
    if(err){
      return console.log('Unable to insert', err);
    }
  });
  
  db.close();

});
