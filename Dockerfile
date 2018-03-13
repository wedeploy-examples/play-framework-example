FROM ingensi/play-framework

COPY /app /app

CMD ["activator", "start"]