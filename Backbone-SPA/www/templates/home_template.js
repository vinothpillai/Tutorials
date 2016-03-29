var home_template = '<h2>hello : <%= username %></h2> \
					 <input type="button" value="logout" id="back"/>\
					 <div class="myContainer">\
						 <ul id="empDiv" id="emplist">\
							 <% _.each(empList, function(emp) { %>  \
							  <li data-index="@index"><%= emp.empName %></li> \
							 <% }); %>\
						 </ul>\
					 </div>\
					 ';