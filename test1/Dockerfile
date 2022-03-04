ARG APP_NAME=${APP_NAME}

FROM vimal13/apache-webserver-php

ARG APP_NAME

EXPOSE 80
CMD echo ${APP_NAME}
ENTRYPOINT [ "httpd" ]

CMD [ "-DFOREGROUND" ]
