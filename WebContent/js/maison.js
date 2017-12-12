$(document).ready(function () {
  $('.carousel').carousel();
  $(".button-collapse").sideNav();
  $('.parallax').parallax();
  $('.slider').slider();
  $('.modal').modal();
  $('select').material_select();
  $('.pgwSlideshow').pgwSlideshow();

  $('#deroule1').click(function () {
    var text = $(this).children('h5');
    if (text.is(':hidden')) {
      text.slideDown('500');
      $(this).children('i.fleche').html('keyboard_arrow_up');
    }
    else {
      text.slideUp('300');
      $(this).children('i.fleche').html('keyboard_arrow_down');
    }
  })

  $('#deroule2').click(function () {
    var text = $(this).children('h5');
    if (text.is(':hidden')) {
      text.slideDown('500');
      $(this).children('i.fleche').html('keyboard_arrow_up');
    }
    else {
      text.slideUp('300');
      $(this).children('i.fleche').html('keyboard_arrow_down');
    }
  })

  $('#deroule3').click(function () {
    var text = $(this).children('h5');
    if (text.is(':hidden')) {
      text.slideDown('500');
      $(this).children('i.fleche').html('keyboard_arrow_up');
    }
    else {
      text.slideUp('300');
      $(this).children('i.fleche').html('keyboard_arrow_down');
    }
  })

  $('#deroule4').click(function () {
    var text = $(this).children('h5');
    if (text.is(':hidden')) {
      text.slideDown('500');
      $(this).children('i.fleche').html('keyboard_arrow_up');
    }
    else {
      text.slideUp('300');
      $(this).children('i.fleche').html('keyboard_arrow_down');
    }
  })

  $('#deroule5').click(function () {
    var text = $(this).children('h5');
    if (text.is(':hidden')) {
      text.slideDown('500');
      $(this).children('i.fleche').html('keyboard_arrow_up');
    }
    else {
      text.slideUp('300');
      $(this).children('i.fleche').html('keyboard_arrow_down');
    }
  })



  function faffichage()
  { 
    alert("Nom : " + document.getElementById('testNom').value) ; 
    alert("prenom : " + document.getElementById('prenom').value) ;
    alert("telephone : " + document.getElementById('telephone').value) ; 
    alert("mail : " + document.getElementById('mail').value) ; 
    
  }
  /* var nom = document.getElementById("testNom"); 
  nom.addEventListener("click", testString);

  function testString(){
   alert('test');
    } */

});



$('.datepicker').pickadate({
  format: 'd/mm/yyyy',
  labelMonthNext: 'Mois Suivant',
  labelMonthPrev: 'Mois Précédent',
  labelMonthSelect: 'Choisir le Mois',
  labelYearSelect: 'Choisir une Année',
  monthsFull: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Aout', 'Septembre', 'Octobre', 'Novembre', 'Decembre'],
  monthsShort: ['Jan', 'Fev', 'Mar', 'Avr', 'Mai', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
  weekdaysFull: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'],
  weekdaysShort: ['Dim', 'Lun', 'Mar', 'Mer', 'Jeu', 'Ven', 'Sam'],
  weekdaysLetter: ['D', 'L', 'M', 'M', 'J', 'V', 'S'],
  firstDay: 1,
  today: 'Aujourd\'hui',
  clear: 'Vider',
  close: 'Fermer'

});




function compteCase() {
  nbCaseCochees = $('input:checked').length;
  return nbCaseCochees;

};

$('#view').click(function () {
  var variable1 = document.getElementById('nuitee').value;
  console.log(variable1)
  var variable2 = document.getElementById('tarif').value;
  console.log(variable2)
  if (variable1 != "" && variable2 != "") { 
    var variable3 = parseFloat(variable1) * parseFloat(variable2);
    var variable4 = compteCase() * 10 * variable1
    console.log(variable3)
    console.log(variable4)
    var variable5 = variable3 + variable4
    document.getElementById('total').value = variable5.toFixed(2) + ' €'
  } else {
    document.getElementById('total').value = '0';
  }


 

  
 

});
