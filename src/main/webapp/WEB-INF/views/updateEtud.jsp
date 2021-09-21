
<%@include file="../common/header.jspf"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  

<%@include file="../common/navbar.jspf"%>


<center><h1>UPDATE STUDENTS</h1></center>

<div class="container">
<form:form action="/updateEtud?id=${etud.id }" method="POST" modelAttribute="etud">
  <div class="form-group row">
    <form:label path="nom" for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">NOM</form:label>
    <div class="col-sm-10">
      <form:input  path="nom" class="form-control form-control-lg" id="colFormLabelLg" />
    </div>
  </div>
  <div class="form-group row">
    <form:label path="prenom" for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">PRENOM</form:label>
    <div class="col-sm-10">
      <form:input  path="prenom" class="form-control form-control-lg" id="colFormLabelLg" />
    </div>
  </div>
  
  <div class="form-group row">
    <form:label path="age" for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">AGE</form:label>
    <div class="col-sm-10">
      <form:input  path="age" class="form-control form-control-lg" id="colFormLabelLg" />
    </div>
  </div>
  
  <div class="form-group row">
    <form:label path="niveau" for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">NIVEAU</form:label>
    <div class="col-sm-10">
      <form:input  path="niveau" class="form-control form-control-lg" id="colFormLabelLg" />
    </div>
  </div>
  
  <div class="col-12 mt-3">
 <button onclick="return confirm('Are you sure!')" type="submit" class="btn btn-success">Save Change</button>
 </div>
</form:form>
</div>

<%@include file="../common/footer.jspf"%>

