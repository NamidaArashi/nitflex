/*!
 * Parque Natural
 * Cristina, GII, URJC
 */

/* Menu de navegacion tipo fixed especial de Bootstrap */
(jQuery), $(function () {
    $("body").on("input propertychange", ".floating-label-form-group", function (a) {
        $(this).toggleClass("floating-label-form-group-with-value", !!$(a.target).val())
    }).on("focus", ".floating-label-form-group", function () {
        $(this).addClass("floating-label-form-group-with-focus")
    }).on("blur", ".floating-label-form-group", function () {
        $(this).removeClass("floating-label-form-group-with-focus")
    })
});

jQuery(document).ready(function (a) {
    var b = 1170;
    if (a(window).width() > b) {
        var c = a(".navbar-custom").height();
        a(window).on("scroll", {
            previousTop: 0
        }, function () {
            var b = a(window).scrollTop();
            b < this.previousTop ? b > 0 && a(".navbar-custom").hasClass("is-fixed") ? a(".navbar-custom").addClass("is-visible") : a(".navbar-custom").removeClass("is-visible is-fixed") : (a(".navbar-custom").removeClass("is-visible"), b > c && !a(".navbar-custom").hasClass("is-fixed") && a(".navbar-custom").addClass("is-fixed")), this.previousTop = b
        })
    }
});

/* Esto permite usar los tooltip de Bootstrap */
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();
});