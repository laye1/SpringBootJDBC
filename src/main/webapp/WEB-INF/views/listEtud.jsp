<%@include file="../common/header.jspf"%>
<%@include file="../common/navbar.jspf"%>


<center><h1><p>LIST OF STUDENTS</p></h1><center>


<div class="container">
  
<table class="table">
  <thead>
  
    <tr>
      <th scope="col">Id</th>
      <th scope="col">LastName</th>
      <th scope="col">Firstname</th>
      <th scope="col">Age</th>
      <th scope="col">Niveau</th>
     
      <th scope="col"></th>
      
    </tr>
    
  </thead>
  <tbody>
<c:forEach items="${etudiant }" var="etud" >
    <tr>
      <th scope="row">${etud.id}</th>
      <td>${etud.nom}</td>
      <td>${etud.prenom}</td>
      <td>${etud.age}</td>
      <td>${etud.niveau}</td>
      <td><a href="/deleteEtud?id=${etud.id}"><button  class="btn btn-danger">delete</button></a></td>
      <td><a href="/updateEtud?id=${etud.id}"><button  class="btn btn-primary">update</button></a></td>
     
      </tr>
 
    </c:forEach>
    </tbody>
    </table>
    </div>
    
     <a href="/formEtud"> <button  class="btn btn-primary">  AJOUTER</button></a>
  
  
  <%@include file="../common/footer.jspf"%>