var Home_view = Backbone.View.extend({	
	template: _.template('<label>hello: <%= username %></label> <br/> <input type="button" value="logout" id="back"/>'),
	
	model : LoginModel,
	
    render: function () {
		this.$el.html(this.template(this.model.attributes));//adding the template content to the main template.
    },
	
	events : {
		'click #back':'goToLogin'
	},
	
	goToLogin : function(event){
		appRouter.navigate("/",{trigger:true});
	}
});