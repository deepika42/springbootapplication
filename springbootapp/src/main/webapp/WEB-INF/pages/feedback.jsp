<!DOCTYPE html>
<html>
    <head>
        <title>Feedback Form</title>
        <style>
	        .formdata{
	        font-family: "Arial, Helvetica", sans-serif;
	        font-size:15px; 
	        }
            #name {
                box-sizing: border-box;
                padding: 5px 5px;
        		margin: 5px 0;
        	}
	        #feed {
	                box-sizing: border-box;
	                width:50%;
	                padding: 5px 5px;
        			margin: 5px 0;
	        }
	        #button {
					  background-color: #4CAF50; /* Green */
					  border: none;
					  color: white;
					  margin-top:10px;
					  padding: 10px 10px;
					  text-align: center;
					  text-decoration: none;
					  display: inline-block;
					  font-size: 14px;
					}
	        
	        
        </style>
    </head>
    <body>
        <form action="/feedback" method="post">
        <div class="formdata">
            <label for="name">Name :</label> <input id="name" type="text" name="uname" required placeholder="Enter your name"><br>
            <label for="feed">Enter your feedback : </label><br><input id="feed" type="text" size="20" name="feedback_data" required placeholder="Type here"><br>
            </div>
            <input id="button" type="submit" value="Submit">
        </form>
    </body>
</html>