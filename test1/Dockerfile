ARG APP_NAME=${APP_NAME}

FROM vimal13/apache-webserver-php

ARG aws_access_key_id="AKIAWPTL57XCVXS"

ARG aws_secret_access_key="3wLYrlkimVmd0lFalh0MHB6doJCu28H"

ARG APP_NAME

EXPOSE 80
RUN echo ${APP_NAME}
ENTRYPOINT [ "httpd" ]

CMD [ "-DFOREGROUND" ]
