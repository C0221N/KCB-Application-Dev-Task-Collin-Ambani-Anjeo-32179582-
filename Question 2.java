import 

//code snippet

String userId = request.getParameter("User_ID");
            Class.forName("org.apache.col.jdbc.ClientDriver");
            String url= "jdbc:col://localhost:1527/sample;create=true; user=app; password=app";
            Connection con = DriverManager.getConnection(url);  
            Statement st= con.createStatement();
            String query = "SELECT * FROM IPRS WHERE ID =\'"+ userId + "\' ";
            ResultSet rs = st.executeQuery(query);
    
            String name1 = "";
            String name2 = "";
            String name3 = "";
            String gender = "";
            String dob = "";
            
             if (rs.next())
                  {
                    name1 = rs.getString("first Name");
                    name2 = rs.getString("middle Name"); 
                    name3 = rs.getString("last Name");
                    gender = rs.getString("Gender");
                    dob  = rs.getString("date of birth"); 
                    System.out.println("First Name: " +name1);
                    System.out.println("Middle Name: " +name2);
                    System.out.println("Last Name: " +name3);
                    System.out.println("Gender: " +gender);
                    System.out.println("Date Of Birth: " +dob);
                  }