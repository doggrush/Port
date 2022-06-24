int var = 0, var2 = 0;
void setup()
{
  pinMode(A0, OUTPUT);
  pinMode(6, OUTPUT);
  Serial.begin(9600);
}

void loop()
{
  Serial.println(var2);
  var = analogRead(A0);
  delay(50);
  if (var < 13){
    if (var2 < 255) {
      var2 = var2+5;
   analogWrite(6, var2);
    }
    

   
  }
  else {
    if( var2 > 0){
      var2 = var2-5;
      analogWrite(6, var2);
    }
    
  }
}
