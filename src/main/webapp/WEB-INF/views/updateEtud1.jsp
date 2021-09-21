<%@include file="../common/header.jspf"%>  

<%@include file="../common/navbar.jspf"%>


<center><h1>UPDATE STUDENTS</h1></center>

<div class="container">
<form action="/updateEtud" method="POST">
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">NOM</label>
    <div class="col-sm-10">
      <input type="text" name="nom" class="form-control form-control-lg" id="colFormLabelLg" placeholder="nom">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">PRENOM</label>
    <div class="col-sm-10">
      <input type="text" name="prenom" class="form-control form-control-lg" id="colFormLabelLg" placeholder="prenom">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">AGE</label>
    <div class="col-sm-10">
      <input type="text" name="age" class="form-control form-control-lg" id="colFormLabelLg" placeholder="age">
    </div>
  </div>
  <div class="form-group row">
    <label for="colFormLabelLg" class="col-sm-2 col-form-label col-form-label-lg">NIVEAU</label>
    <div class="col-sm-10">
      <input type="text" name="niveau" class="form-control form-control-lg" id="colFormLabelLg" placeholder="niveau">
    </div>
  </div>
  
  <button type="submit" class="btn btn-primary">VALIDER</button>
</form>
</div>

<%@include file="../common/footer.jspf"%>

