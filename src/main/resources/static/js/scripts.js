/*******Start index page********/

/*Carousel*/
$(document).ready(function() {
    $(".dropdown-button").dropdown({
        inDuration: 300,
        outDuration: 225,
        constrainWidth: true, // Does not change width of dropdown to that of the activator
        hover: true, // Activate on hover
        gutter: 0, // Spacing from edge
        belowOrigin: true, // Displays dropdown below the button
        alignment: 'left', // Displays dropdown with edge aligned to the left of button
        stopPropagation: false // Stops event propagation
    });

    $(".button-collapse").sideNav({
        menuWidth: 200, // Default is 300
        edge: 'left', // Choose the horizontal origin
        closeOnClick: false, // Closes side-nav on <a> clicks, useful for Angular/Meteor
        draggable: true // Choose whether you can drag to open on touch screens
    });

    $('.carousel.carousel-slider').carousel({
        fullWidth: true
    });

    $('select').material_select();

    setInterval("$('.index.carousel').carousel('next');", 4000);

    /*Data binding*/
    $('.select-order').click(function() {
        var index = Math.floor((Math.random() * 5) + 2);
        var x = $('.order div:nth-child(' + index + ')').text();
        $("#set-order").text(x);
    });
});


/*******End index page********/