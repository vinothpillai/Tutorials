var Home_view = Backbone.View.extend({	
	template: _.template(home_template),
	
	model : LoginModel,
	
    render: function () {
		this.$el.html(this.template(this.model.attributes));//adding the template content to the main template.
    },
	
	events : {
		'click #back':'goToLogin',
		'click #emplist':'displayEmpDetails'
	},
	
	goToLogin : function(event){
		appRouter.navigate("/",{trigger:true});
	},
	
	displayEmpDetails : function(event){
		var empIndex = $(event.target).data('index');
		console.log('empIndex');
	}
});